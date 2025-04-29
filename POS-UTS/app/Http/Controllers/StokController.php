<?php 
namespace App\Http\Controllers;

use App\Models\StokModel;
use App\Models\BarangModel;
use Illuminate\Http\Request;

class StokController extends Controller
{
    public function index()
    {
        $stok = StokModel::with('barang')->get();
        return view('stok.index', compact('stok'));
    }

    public function store(Request $request)
    {
        $request->validate([
            'barang_id' => 'required',
            'stok_jumlah' => 'required|integer',
        ]);

        StokModel::create([
            'barang_id' => $request->barang_id,
            'user_id' => auth()->id(),
            'stok_tanggal_masuk' => now(),
            'stok_jumlah' => $request->stok_jumlah,
            'supplier_id' => 1, // Assuming supplier_id
        ]);

        return redirect()->route('stok.index');
    }
}
