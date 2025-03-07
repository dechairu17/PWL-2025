<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        // Buat tabel dulu tanpa foreign key
        Schema::create('m_level', function (Blueprint $table) {
            $table->id(); // Primary Key
            $table->string('level_nama', 100);
            $table->timestamps();
        });

        // Baru tambahkan kolom foreign key setelah tabel selesai dibuat
        Schema::table('m_level', function (Blueprint $table) {
            $table->unsignedBigInteger('level_id')->nullable()->after('id');
            $table->foreign('level_id')->references('id')->on('m_level')->onDelete('cascade');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('m_level');
    }
};
