<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateTPenjualanTable extends Migration
{
    public function up()
    {
        Schema::create('t_penjualan', function (Blueprint $table) {
            $table->id('penjualan_id'); // Primary key bernama penjualan_id
            $table->unsignedBigInteger('user_id');
            $table->string('pembeli', 100);
            $table->string('penjualan_kode', 20)->unique();
            $table->dateTime('penjualan_tanggal');
            $table->timestamps();

            // Foreign key: user_id merujuk ke m_user.user_id
            $table->foreign('user_id')
                  ->references('user_id')->on('m_user')
                  ->onDelete('cascade');
        });
    }

    public function down()
    {
        Schema::dropIfExists('t_penjualan');
    }
}
