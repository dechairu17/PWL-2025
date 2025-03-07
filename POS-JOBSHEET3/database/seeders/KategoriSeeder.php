<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class KategoriSeeder extends Seeder
{
    public function run()
    {
        DB::table('m_kategori')->delete();

        DB::table('m_kategori')->insert([
            ['kode_kategori' => 'KTG01', 'nama_kategori' => 'Elektronik'],
            ['kode_kategori' => 'KTG02', 'nama_kategori' => 'Pakaian'],
            ['kode_kategori' => 'KTG03', 'nama_kategori' => 'Makanan'],
            ['kode_kategori' => 'KTG04', 'nama_kategori' => 'Buku'],
            ['kode_kategori' => 'KTG05', 'nama_kategori' => 'Olahraga'],
        ]);
    }
}
