<?php
namespace App\Models;

use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Factories\HasFactory;


class PenjualanModel extends Model
{
    use HasFactory;

    protected $table = 't_penjualan';

    protected $fillable = [
        'user_id', 'pembeli', 'penjualan_kode', 'tanggal_penjualan'
    ];

    public function user()
    {
        return $this->belongsTo(UserModel::class, 'user_id', 'user_id');
    }

    public function details()
    {
        return $this->hasMany(DetailPenjualanModel::class, 'penjualan_id', 'penjualan_id');
    }
}
