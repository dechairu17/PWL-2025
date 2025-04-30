<?php
namespace App\Http\Controllers;

use App\Models\PenjualanModel;
use App\Models\DetailPenjualanModel;
use App\Models\BarangModel;
use Illuminate\Http\Request;

class PenjualanController extends Controller
{
    public function index()
{
    $activeMenu = 'penjualan'; // Menandai menu penjualan aktif
    return view('penjualan.index', compact('activeMenu'));
}

    public function create()
    {
        $barang = BarangModel::all();
        return view('penjualan.create', compact('barang'));
    }

    public function store(Request $request)
    {
        $penjualan = PenjualanModel::create([
            'user_id' => auth()->id(),
            'pembeli' => $request->pembeli,
            'penjualan_kode' => 'PENJUALAN-' . now()->timestamp,
            'tanggal_penjualan' => now(),
        ]);

        foreach ($request->items as $item) {
            DetailPenjualanModel::create([
                'penjualan_id' => $penjualan->penjualan_id,
                'barang_id' => $item['barang_id'],
                'jumlah_barang' => $item['jumlah_barang'],
                'harga_barang' => $item['harga_barang'],
            ]);

            // Update stok barang
            $barang = BarangModel::find($item['barang_id']);
            $barang->decrement('stok_jumlah', $item['jumlah_barang']);
        }

        return redirect()->route('penjualan.index');
    }
}
