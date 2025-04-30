@extends('layouts.template')

@section('content')
    <div class="card card-outline card-primary">
        <div class="card-header">
            <h3 class="card-title">Tambah Stok Barang</h3>
        </div>
        <div class="card-body">
            <form action="{{ route('stok.store') }}" method="POST">
                @csrf
                <div class="form-group">
                    <label for="barang_id">Barang</label>
                    <select name="barang_id" class="form-control" required>
                        @foreach ($barang as $item)
                            <option value="{{ $item->barang_id }}">{{ $item->barang_nama }}</option>
                        @endforeach
                    </select>
                </div>

                <div class="form-group">
                    <label for="stok_jumlah">Jumlah Stok</label>
                    <input type="number" name="stok_jumlah" class="form-control" required>
                </div>

                <button type="submit" class="btn btn-primary">Tambah Stok</button>
                <a href="{{ route('stok.index') }}" class="btn btn-secondary">Kembali</a>
            </form>
        </div>
    </div>
@endsection
