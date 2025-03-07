<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateTPenjualanDetailTable extends Migration
{
    public function up()
    {
        Schema::create('t_penjualan_detail', function (Blueprint $table) {
            $table->id('detail_id'); // Primary key bernama detail_id
            $table->unsignedBigInteger('penjualan_id');
            $table->unsignedBigInteger('barang_id');
            $table->integer('harga');
            $table->integer('jumlah');
            $table->timestamps();

            // Foreign key: penjualan_id mengacu ke t_penjualan.penjualan_id
            $table->foreign('penjualan_id')
                  ->references('penjualan_id')->on('t_penjualan')
                  ->onDelete('cascade');

            // Foreign key: barang_id mengacu ke m_barang.barang_id
            $table->foreign('barang_id')
                  ->references('barang_id')->on('m_barang')
                  ->onDelete('cascade');
        });
    }

    public function down()
    {
        Schema::dropIfExists('t_penjualan_detail');
    }
}
