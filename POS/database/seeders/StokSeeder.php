<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class StokSeeder extends Seeder
{
    public function run()
    {
        DB::table('t_stok')->delete();

        DB::table('t_stok')->insert([
            [
                'barang_id'   => 1, // Pastikan data di m_barang sudah ada
                'user_id'     => 1, // Pastikan data di m_user sudah ada
                'stok_tanggal'=> now(),
                'stok_jumlah' => 10,
            ],
            // Tambahkan data stok lainnya jika perlu
        ]);
    }
}
