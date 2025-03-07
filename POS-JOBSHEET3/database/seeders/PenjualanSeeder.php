<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class PenjualanSeeder extends Seeder
{
    public function run()
    {
        DB::table('t_penjualan')->delete();

        DB::table('t_penjualan')->insert([
            [
                'user_id'           => 1, // Pastikan user ada di m_user
                'pembeli'           => 'Pelanggan 1',
                'penjualan_kode'    => 'TRX001',
                'penjualan_tanggal' => now(),
            ],
            // Tambahkan data penjualan lainnya jika perlu
        ]);
    }
}
