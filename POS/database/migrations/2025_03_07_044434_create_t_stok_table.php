<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateTStokTable extends Migration
{
    public function up()
    {
        Schema::create('t_stok', function (Blueprint $table) {
            $table->id('stok_id'); // Primary key bernama stok_id
            $table->unsignedBigInteger('barang_id');
            $table->unsignedBigInteger('user_id');
            $table->dateTime('stok_tanggal');
            $table->integer('stok_jumlah');
            $table->timestamps();

            // Foreign key untuk barang_id: mengacu ke m_barang.barang_id
            $table->foreign('barang_id')
                  ->references('barang_id')->on('m_barang')
                  ->onDelete('cascade');

            // Foreign key untuk user_id: mengacu ke m_user.user_id
            $table->foreign('user_id')
                  ->references('user_id')->on('m_user')
                  ->onDelete('cascade');
        });
    }

    public function down()
    {
        Schema::dropIfExists('t_stok');
    }
}
