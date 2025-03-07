<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class PenjualanDetailSeeder extends Seeder
{
    public function run()
    {
        DB::table('t_penjualan_detail')->delete();

        DB::table('t_penjualan_detail')->insert([
            [
                'penjualan_id' => 1, // Pastikan penjualan ada di t_penjualan
                'barang_id'    => 1, // Pastikan barang ada di m_barang
                'harga'        => 6000000,
                'jumlah'       => 1,
            ],
            // Tambahkan data penjualan detail lainnya jika perlu
        ]);
    }
}
