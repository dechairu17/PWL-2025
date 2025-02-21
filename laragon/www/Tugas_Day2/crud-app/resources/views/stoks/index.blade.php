@extends('layouts.app')

@section('content')
    <h1>Daftar Stok</h1>
    <a href="{{ route('stok.create') }}">Tambah Stok Baru</a>
    @foreach ($stoks as $stok)
        <p>{{ $stok->name }} - {{ $stok->description }}</p>
        <a href="{{ route('stok.edit', $stok) }}">Edit</a>
        <form action="{{ route('stok.destroy', $stok) }}" method="POST">
            @csrf
            @method('DELETE')
            <button type="submit">Hapus</button>
        </form>
    @endforeach
@endsection
