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
        // return view('user', ['data' => $user]);

        // $user = UserModel::create([
        //     'username' => 'manager55',
        //     'nama' => 'Manager55',
        //     'password' => Hash::make('12345'),
        //     'level_id' => 2,
        // ]);

        // // Mengubah nilai username
        // $user->username = 'manager56';

        // // Mengecek perubahan sebelum disimpan
        // dump($user->isDirty()); // true
        // dump($user->isDirty('username')); // true
        // dump($user->isDirty('nama')); // false
        // dump($user->isDirty(['nama', 'username'])); // true

        // dump($user->isClean()); // false
        // dump($user->isClean('username')); // false
        // dump($user->isClean('nama')); // true
        // dump($user->isClean(['nama', 'username'])); // false

        // // Menyimpan perubahan ke database
        // $user->save();

        // // Mengecek perubahan setelah disimpan
        // dump($user->isDirty()); // false
        // dump($user->isClean()); // true

        // // Menghentikan eksekusi dan menampilkan hasil terakhir
        // dd($user->isDirty());

        // $user = UserModel::create([
        //     'username' => 'manager11',
        //     'nama' => 'Manager11',
        //     'password' => Hash::make('12345'),
        //     'level_id' => 2,
        // ]);

        // // Mengubah nilai username
        // $user->username = 'manager12';

        // $user->save();

        // $user->wasChanged(); //true
        // $user->wasChanged('username'); //true
        // $user->wasChanged(['username','level_id']); //true
        // $user->wasChanged('nama'); //false
        // dd($user->wasChanged(['nama','username']));//true

        $user = UserModel::all();
        return view('user', ['data' => $user]);
    }

    public function tambah()
    {
        return view('user_tambah');
    }

    public function tambah_simpan(Request $request)
    {
        UserModel::create([
            'username' => $request->username,
            'nama' => $request->nama,
            'password' => Hash::make('$request->password'),
            'level_id' => $request->level_id
        ]);
        return redirect('/user');
    }

    public function ubah($id)
    {
        $user = UserMOdel::find($id);
        return view ('user_ubah', ['data' => $user]);
    }

    public function ubah_simpan($id, Request $request)
    {
        $user = UserModel::find($id);

        $user->username = $request->username;
        $user->nama = $request->nama;
        $user->pasword = Hash::make('$request->password');
        $user->level_id = $request->level_id;
        
        $user->save();

        return redirect('/user');
    }   

    public function hapus($id)
    {
        $user = UserModel::find($id);
        $user->delete();

        return redirect('/user');
    }
}