@extends('layouts.template')

@section('content')
    <div class="card card-outline card-primary">
        <div class="card-header">
            <h3 class="card-title">Daftar Transaksi Penjualan</h3>
            <div class="card-tools">
                <a class="btn btn-sm btn-primary mt-1" href="{{ route('penjualan.create') }}">Tambah Transaksi</a>
            </div>
        </div>
        <div class="card-body">
            @if (session('success'))
                <div class="alert alert-success">{{ session('success') }}</div>
            @endif
            @if (session('error'))
                <div class="alert alert-danger">{{ session('error') }}</div>
            @endif

            <table class="table table-bordered table-striped table-hover table-sm" id="table_penjualan">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Kode Penjualan</th>
                        <th>Pembeli</th>
                        <th>Tanggal Penjualan</th>
                        <th>Aksi</th>
                    </tr>
                </thead>
            </table>
        </div>
    </div>
@endsection

@push('js')
    <script>
        $(document).ready(function() {
            $('#table_penjualan').DataTable({
                processing: true,
                serverSide: true,
                ajax: {
                    url: "{{ route('penjualan.index') }}",
                    type: "GET",
                },
                columns: [
                    { data: 'penjualan_id' },
                    { data: 'penjualan_kode' },
                    { data: 'pembeli' },
                    { data: 'tanggal_penjualan' },
                    { data: 'aksi' }
                ]
            });
        });
    </script>
@endpush
