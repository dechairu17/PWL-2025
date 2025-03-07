<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateMKategoriTable extends Migration
{
    public function up()
    {
        Schema::create('m_kategori', function (Blueprint $table) {
            $table->id('kategori_id'); // Primary key bernama kategori_id
            $table->string('kode_kategori', 10)->unique();
            $table->string('nama_kategori', 100);
            // Jika ingin menyimpan deskripsi, aktifkan baris di bawah:
            // $table->string('deskripsi')->nullable();
            $table->timestamps();
        });
    }

    public function down()
    {
        Schema::dropIfExists('m_kategori');
    }
}
