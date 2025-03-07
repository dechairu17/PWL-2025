<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

class UserSeeder extends Seeder
{
    public function run()
    {
        DB::table('m_user')->delete();

        DB::table('m_user')->insert([
            [
                'level_id' => 1,
                'username' => 'admin',
                'nama'     => 'Administrator',
                'email'    => 'admin@example.com',
                'password' => Hash::make('12345'),
            ],
            [
                'level_id' => 2,
                'username' => 'manager',
                'nama'     => 'Manager',
                'email'    => 'manager@example.com',
                'password' => Hash::make('12345'),
            ],
            [
                'level_id' => 3,
                'username' => 'staff',
                'nama'     => 'Staff/Kasir',
                'email'    => 'staff@example.com',
                'password' => Hash::make('12345'),
            ],
        ]);
    }
}
