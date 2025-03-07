<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class LevelController extends Controller
{
    public function index()
{
    // DB::insert('INSERT IGNORE INTO m_level(level_kode, level_nama, created_at) VALUES(?, ?, ?)', 
    // ['CUS', 'Pelanggan', now()]);

    // return 'Data berhasil ditambahkan (atau sudah ada sebelumnya).';

    $data = DB::select('select * from m_level');
    return view('level' , ['data' => $data]);
}

}
