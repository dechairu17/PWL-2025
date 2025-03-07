<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateMUserTable extends Migration
{
    public function up()
    {
        Schema::create('m_user', function (Blueprint $table) {
            $table->id('user_id'); // Primary key auto-increment
            $table->unsignedBigInteger('level_id');
            $table->string('username', 50)->unique();
            $table->string('nama', 100);
            $table->string('email')->unique();
            $table->string('password');
            $table->timestamps();

            $table->foreign('level_id')
                  ->references('level_id')->on('m_level')
                  ->onDelete('cascade');
        });
    }

    public function down()
    {
        Schema::dropIfExists('m_user');
    }
}
