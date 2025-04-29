<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use App\Models\DetailBarang;

class DetailBarangSeeder extends Seeder
{
    public function run()
    {
        DetailBarang::create([
            'kategori_id' => 1,
            'barang_kode' => 'ELK01',
            'barang_nama' => 'Laptop',
            'dimensi' => '30cm x 20cm x 2cm',
            'deskripsi' => 'Laptop gaming high performance',
            'harga_beli' => 4000000,
            'harga_jual' => 5000000,
        ]);

        DetailBarang::create([
            'kategori_id' => 1,
            'barang_kode' => 'ELK02',
            'barang_nama' => 'Monitor',
            'dimensi' => '50cm x 30cm x 5cm',
            'deskripsi' => 'Monitor full HD',
            'harga_beli' => 400000,
            'harga_jual' => 500000,
        ]);

        DetailBarang::create([
            'kategori_id' => 2,
            'barang_kode' => 'FSH01',
            'barang_nama' => 'Kemeja',
            'dimensi' => 'M Size',
            'deskripsi' => 'Kemeja katun premium',
            'harga_beli' => 120000,
            'harga_jual' => 150000,
        ]);
    }
}
