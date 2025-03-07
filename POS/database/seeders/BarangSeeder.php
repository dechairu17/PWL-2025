<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class BarangSeeder extends Seeder
{
    public function run()
    {
        DB::table('m_barang')->insert([
            [
                'kategori_id' => 1,
                'barang_kode' => 'BRG001',
                'barang_nama' => 'Laptop',
                'harga_beli'  => 5000000,
                'harga_jual'  => 6000000,
            ],
            [
                'kategori_id' => 1,
                'barang_kode' => 'BRG002',
                'barang_nama' => 'Smartphone',
                'harga_beli'  => 3000000,
                'harga_jual'  => 3500000,
            ],
            [
                'kategori_id' => 2,
                'barang_kode' => 'BRG003',
                'barang_nama' => 'Kaos',
                'harga_beli'  => 50000,
                'harga_jual'  => 75000,
            ],
            [
                'kategori_id' => 2,
                'barang_kode' => 'BRG004',
                'barang_nama' => 'Celana Jeans',
                'harga_beli'  => 120000,
                'harga_jual'  => 150000,
            ],
            [
                'kategori_id' => 3,
                'barang_kode' => 'BRG005',
                'barang_nama' => 'Mie Instan',
                'harga_beli'  => 2500,
                'harga_jual'  => 3500,
            ],
            [
                'kategori_id' => 3,
                'barang_kode' => 'BRG006',
                'barang_nama' => 'Susu UHT',
                'harga_beli'  => 7000,
                'harga_jual'  => 9000,
            ],
            [
                'kategori_id' => 4,
                'barang_kode' => 'BRG007',
                'barang_nama' => 'Novel',
                'harga_beli'  => 50000,
                'harga_jual'  => 70000,
            ],
            [
                'kategori_id' => 4,
                'barang_kode' => 'BRG008',
                'barang_nama' => 'Kamus',
                'harga_beli'  => 75000,
                'harga_jual'  => 95000,
            ],
            [
                'kategori_id' => 5,
                'barang_kode' => 'BRG009',
                'barang_nama' => 'Bola Sepak',
                'harga_beli'  => 100000,
                'harga_jual'  => 130000,
            ],
            [
                'kategori_id' => 5,
                'barang_kode' => 'BRG010',
                'barang_nama' => 'Sepatu Lari',
                'harga_beli'  => 200000,
                'harga_jual'  => 250000,
            ],
        ]);
    }
}
