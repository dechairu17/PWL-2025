@extends('layouts.template')

@section('content')
    <div class="card card-outline card-primary">
        <div class="card-header">
            <h3 class="card-title">Transaksi Penjualan</h3>
        </div>
        <div class="card-body">
            <form action="{{ route('penjualan.store') }}" method="POST">
                @csrf
                <div class="form-group">
                    <label for="pembeli">Nama Pembeli</label>
                    <input type="text" name="pembeli" class="form-control" id="pembeli" required>
                </div>

                <div id="items-section">
                    <div class="form-group">
                        <label for="barang_id">Barang</label>
                        <select name="items[0][barang_id]" class="form-control" id="barang_id" required>
                            @foreach ($barang as $item)
                                <option value="{{ $item->barang_id }}">{{ $item->barang_nama }} - Rp {{ number_format($item->harga_jual) }}</option>
                            @endforeach
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="jumlah_barang">Jumlah Barang</label>
                        <input type="number" name="items[0][jumlah_barang]" class="form-control" id="jumlah_barang" required>
                    </div>
                    <input type="hidden" name="items[0][harga_barang]" value="{{ $item->harga_jual }}">
                </div>

                <button type="submit" class="btn btn-success">Simpan Transaksi</button>
            </form>
        </div>
    </div>
@endsection
