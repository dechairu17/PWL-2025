<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class DetailBarang extends BarangModel
{
    use HasFactory;

    protected $table = 'detail_barang';

    protected $fillable = [
        'kategori_id', 
        'barang_kode',
        'barang_nama',
        'dimensi',
        'deskripsi',
        'harga_beli',
        'harga_jual',
    ];

    public function barang()
    {
        return $this->belongsTo(BarangModel::class, 'barang_id', 'barang_id');
    }           

}
