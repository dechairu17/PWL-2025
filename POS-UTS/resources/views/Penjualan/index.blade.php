@extends('layouts.template')

@section('content')
    <div class="card card-outline card-primary">
        <div class="card-header">
            <h3 class="card-title">Riwayat Transaksi Penjualan</h3>
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
                        <th>ID Transaksi</th>
                        <th>Kode Penjualan</th>
                        <th>Pembeli</th>
                        <th>Tanggal</th>
                        <th>Aksi</th>
                    </tr>
                </thead>
                <tbody>
                    @foreach ($penjualan as $item)
                        <tr>
                            <td>{{ $item->penjualan_id }}</td>
                            <td>{{ $item->penjualan_kode }}</td>
                            <td>{{ $item->pembeli }}</td>
                            <td>{{ $item->tanggal_penjualan }}</td>
                            <td>
                                <button onclick="modalAction('{{ url('penjualan/' . $item->penjualan_id) }}')" class="btn btn-info btn-sm">Detail</button>
                                <button onclick="modalAction('{{ url('penjualan/' . $item->penjualan_id . '/edit') }}')" class="btn btn-warning btn-sm">Edit</button>
                                <form method="POST" action="{{ url('penjualan/' . $item->penjualan_id) }}" style="display:inline;">
                                    @csrf
                                    @method('DELETE')
                                    <button type="submit" class="btn btn-danger btn-sm" onclick="return confirm('Apakah Anda yakin ingin menghapus transaksi ini?')">Hapus</button>
                                </form>
                            </td>
                        </tr>
                    @endforeach
                </tbody>
            </table>
        </div>
    </div>
@endsection

@push('js')
    <script>
        $(document).ready(function() {
            $('#table_penjualan').DataTable();
        });
    </script>
@endpush
