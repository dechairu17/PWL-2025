<?php

namespace App\Http\Controllers;

use App\Models\UserModel;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Hash;

class UserController extends Controller
{
    public function index(){
        // $data = [
        //     'level_id' => 2,
        //     // 'username' => 'manager_dua',
        //     // 'nama' => 'Manager 2',
        //     'username' => 'manager_tiga',
        //     'nama' => 'Manager 3',
        //     'password' => Hash::make('12345'),
        // ];

        // UserModel::insert($data);

        // $user = UserModel::find(1);

        // $user = UserModel::where('level_id', 1)->first();

        // $user = UserModel::firstwhere('level_id', 1);

        // $user = UserModel::findOr(1, ['username' , 'nama'], function (){
        //     abort(404);
        // });

        // $user = UserModel::findOr(20, ['username' , 'nama'], function (){
        //     abort(404);
        // });

        // $user = UserModel::findOrFail(1);

        // $user = UserModel::where('username', 'manager9')->firstOrfail();

        // $user = UserModel::where('level_id', 2)->count();
        // dd($user);
        // return view('user', ['data' => $user]);

        // $userCount = UserModel::where('level_id', 2)->count(); //userCount untuk menghitung user yang ada pada level yang ingin di cari
        // return view('user', ['userCount' => $userCount]);

        // $user = UserModel::firstOrCreate(
        //     [
        //         'username' => 'manager',
        //         'nama' => 'Manager',
        //     ],
        // );
        
        // $user = UserModel::firstOrCreate(    //--terdapat error dikarenakan pada fillable tidak ada atribut password
        //     [
        //         'level_id' => 2,
        //         'username' => 'manager22',
        //         'nama' => 'Manager Dua Dua',
        //         'password' => Hash::make('12345'),
        //     ],
        // );

        // $user = UserModel::firstOrCreate(
        //     [
        //         'username' => 'manager',
        //         'nama' => 'Manager',
        //     ],
        // );

        // $user = UserModel::firstOrCreate(  // menggunakan $user->save(); tidak berpengaruh pada program saya dikarenakan pada fillable tidak ada atribut password. dan jika pada awalnya sudah di buat maka saat menambahkan user save akan terjadi duplikasi data yang sama
        //     [
        //         'level_id' => 2,
        //         'username' => 'manager33',
        //         'nama' => 'Manager Tiga Tiga',
        //         'password' => Hash::make('12345'),
        //     ],
        // );
        // $user->save();



        return view('user', ['data' => $user]);
    }
}