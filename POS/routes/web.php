<?php


// use App\Http\Controllers\PosController;
use App\Http\Controllers\KategoriController;
use App\Http\Controllers\LevelController;
use App\Http\Controllers\UserController;
use Illuminate\Support\Facades\Route;
// use App\Http\Controllers\HomeController;
// use App\Http\Controllers\ProductController;
// use App\Http\Controllers\UserController;
// use App\Http\Controllers\SalesController;

// Route::get('/', [HomeController::class, 'index']);
// Route::get('/category/food-beverage', [ProductController::class, 'foodBeverage']);
// Route::get('/category/beauty-health', [ProductController::class, 'beautyHealth']);
// Route::get('/category/home-care', [ProductController::class, 'homeCare']);
// Route::get('/category/baby-kid', [ProductController::class, 'babyKid']);



// Route::get('/user/{id}/name/{name}', [UserController::class, 'profile']);
// Route::get('/sales', [SalesController::class, 'index']);
Route::get('/', function () {
    return view('welcome');
});

Route::get('/level', [LevelController::class, 'index']);
Route::get('/kategori', [KategoriController::class, 'index']);
Route::get('/user', [UserController::class, 'index']);






