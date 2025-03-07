<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class LevelSeeder extends Seeder
{
    public function run()
    {
        // Hapus data lama (gunakan delete agar foreign key tidak mengganggu)
        DB::table('m_level')->delete();

        DB::table('m_level')->insert([
            ['level_kode' => 'ADM', 'level_nama' => 'Administrator'],
            ['level_kode' => 'MNG', 'level_nama' => 'Manager'],
            ['level_kode' => 'STF', 'level_nama' => 'Staff/Kasir'],
        ]);
    }
}
