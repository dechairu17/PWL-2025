@extends('layouts.app')

@section('content')
    <h1>Tambah Stok</h1>
    <form action="{{ route('stok.store') }}" method="POST">
        @csrf
        <input type="text" name="name" placeholder="Nama Stok">
        <textarea name="description" placeholder="Deskripsi"></textarea>
        <button type="submit">Simpan</button>
    </form>
@endsection
