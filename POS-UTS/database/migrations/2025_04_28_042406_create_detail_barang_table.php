<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateDetailBarangTable extends Migration
{
    public function up()
    {
        Schema::create('detail_barang', function (Blueprint $table) {
            $table->id();
            $table->unsignedBigInteger('kategori_id'); 
            $table->string('barang_kode')->unique();
            $table->string('barang_nama');
            $table->string('dimensi');
            $table->text('deskripsi');
            $table->integer('harga_beli');
            $table->integer('harga_jual');
            $table->timestamps();
        });
    }

    public function down()
    {
        Schema::dropIfExists('detail_barang');
    }
}
