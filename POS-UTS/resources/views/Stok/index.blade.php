@extends('layouts.template')

@section('content')
    <div class="card card-outline card-primary">
        <div class="card-header">
            <h3 class="card-title">Daftar Stok Barang</h3>
            <div class="card-tools">
                <a class="btn btn-sm btn-primary mt-1" href="{{ route('stok.create') }}">Tambah Stok</a>
            </div>
        </div>
        <div class="card-body">
            @if (session('success'))
                <div class="alert alert-success">{{ session('success') }}</div>
            @endif
            @if (session('error'))
                <div class="alert alert-danger">{{ session('error') }}</div>
            @endif

            <table class="table table-bordered table-striped table-hover table-sm" id="table_stok">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Barang</th>
                        <th>Jumlah Stok</th>
                        <th>Aksi</th>
                    </tr>
                </thead>
                <tbody>
                    @foreach ($stok as $item)
                        <tr>
                            <td>{{ $item->stok_id }}</td>
                            <td>{{ $item->barang->barang_nama }}</td>
                            <td>{{ $item->stok_jumlah }}</td>
                            <td>
                                <form action="{{ route('stok.beli', $item->stok_id) }}" method="POST" style="display:inline;">
                                    @csrf
                                    <input type="number" name="jumlah_beli" class="form-control" min="1" max="{{ $item->stok_jumlah }}" placeholder="Jumlah beli" required>
                                    <button type="submit" class="btn btn-sm btn-success">Beli</button>
                                </form>
                                <a href="{{ route('stok.edit', $item->stok_id) }}" class="btn btn-warning btn-sm">Edit</a>
                                <form method="POST" action="{{ route('stok.destroy', $item->stok_id) }}" style="display:inline;">
                                    @csrf
                                    @method('DELETE')
                                    <button type="submit" class="btn btn-danger btn-sm">Hapus</button>
                                </form>
                            </td>
                        </tr>
                    @endforeach
                </tbody>
            </table>
        </div>
    </div>
@endsection
