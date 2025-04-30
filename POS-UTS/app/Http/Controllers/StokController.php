<?php 
namespace App\Http\Controllers;

use App\Models\StokModel;
use App\Models\BarangModel;
use App\Models\UserModel;
use Illuminate\Http\Request;

class StokController extends Controller
{
    // Menampilkan daftar stok barang
    public function index()
    {
        $page = (object) ['title' => 'Daftar Stok Barang']; // Judul halaman
        $stok = StokModel::with('barang', 'user')->get(); // Mengambil data stok dan barang terkait
        return view('stok.index', compact('stok', 'page'));
    }

    // Menampilkan form tambah stok
    public function create()
    {
        $barang = BarangModel::all(); // Mengambil semua data barang
        return view('stok.create', compact('barang')); // Menampilkan form tambah stok
    }

    // Menyimpan data stok baru
    public function store(Request $request)
    {
        // Validasi input
        $request->validate([
            'barang_id' => 'required|exists:m_barang,barang_id',
            'stok_jumlah' => 'required|integer|min:1',
            'supplier_id' => 'required|exists:suppliers,supplier_id', // Tambahkan validasi supplier_id
        ]);

        // Menyimpan data stok baru
        StokModel::create([
            'barang_id' => $request->barang_id,
            'user_id' => auth()->id(),
            'stok_tanggal_masuk' => now(),
            'stok_jumlah' => $request->stok_jumlah,
            'supplier_id' => $request->supplier_id, // Menyimpan supplier_id
        ]);

        return redirect()->route('stok.index')->with('success', 'Stok berhasil ditambahkan');
    }

    // Menampilkan form edit stok
    public function edit($id)
    {
        $stok = StokModel::findOrFail($id); // Mengambil data stok berdasarkan ID
        $barang = BarangModel::all(); // Mengambil data barang
        return view('stok.edit', compact('stok', 'barang')); // Menampilkan form edit stok
    }

    // Mengupdate data stok
    public function update(Request $request, $id)
    {
        // Validasi input
        $request->validate([
            'barang_id' => 'required|exists:m_barang,barang_id',
            'stok_jumlah' => 'required|integer|min:1',
            'supplier_id' => 'required|exists:suppliers,supplier_id', // Validasi supplier_id
        ]);

        $stok = StokModel::findOrFail($id); // Menemukan stok berdasarkan ID
        $stok->update([
            'barang_id' => $request->barang_id,
            'stok_jumlah' => $request->stok_jumlah,
            'supplier_id' => $request->supplier_id, // Update supplier_id
        ]);

        return redirect()->route('stok.index')->with('success', 'Stok berhasil diperbarui');
    }

    // Menghapus data stok
    public function destroy($id)
    {
        $stok = StokModel::findOrFail($id); // Menemukan stok berdasarkan ID
        $stok->delete(); // Menghapus data stok

        return redirect()->route('stok.index')->with('success', 'Stok berhasil dihapus');
    }

    // Fungsi untuk pembelian dan mengurangi stok
    public function beli(Request $request, $id)
    {
        // Validasi input
        $request->validate([
            'jumlah_beli' => 'required|integer|min:1', // Jumlah beli harus valid
        ]);

        // Menemukan stok berdasarkan ID
        $stok = StokModel::findOrFail($id);

        // Mengecek apakah jumlah yang dibeli tidak lebih dari stok yang ada
        if ($request->jumlah_beli > $stok->stok_jumlah) {
            return redirect()->route('stok.index')->with('error', 'Jumlah pembelian melebihi stok yang tersedia');
        }

        // Mengurangi jumlah stok yang ada
        $stok->stok_jumlah -= $request->jumlah_beli;
        $stok->save(); // Simpan perubahan stok

        // Memberikan notifikasi berhasil
        return redirect()->route('stok.index')->with('success', 'Pembelian berhasil dilakukan, stok diperbarui');
    }
}

