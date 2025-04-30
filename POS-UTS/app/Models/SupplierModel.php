<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Factories\HasFactory;

class SupplierModel extends Model
{
    use HasFactory;

    protected $table = 'suppliers';
    protected $primaryKey = 'supplier_id';

    public function stok(): HasMany
    {
        return $this->hasMany(StokModel::class, 'supplier_id', 'supplier_id');
    }
}
