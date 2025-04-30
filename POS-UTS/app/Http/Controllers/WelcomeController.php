<?php
namespace App\Http\Controllers;

class WelcomeController extends Controller
{
    public function index()
    {
        $breadcrumb = (object) [
            'title' => 'Selamat Datang',
            'list'  => ['Home', 'Welcome']
        ];

        $activeMenu = 'dashboard';  // Menandai menu dashboard aktif

        // Pastikan variabel activeMenu diteruskan ke view
        return view('welcome', compact('breadcrumb', 'activeMenu'));
    }
}
