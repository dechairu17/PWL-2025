<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Relations\BelongsTo;


class DetailPenjualanModel extends Model
{
    use HasFactory;

    protected $table = 't_penjualan_detail';

    protected $fillable = [
        'penjualan_id', 'barang_id', 'jumlah_barang', 'harga_barang'
    ];

    public function penjualan()
    {
        return $this->belongsTo(PenjualanModel::class, 'penjualan_id', 'penjualan_id');
    }

    public function barang()
    {
        return $this->belongsTo(BarangModel::class, 'barang_id', 'barang_id');
    }
}
