<div class="card card-outline card-primary">
    <div class="card-header">
        <h3 class="card-title">Detail Barang</h3>
    </div>
    <div class="card-body">
        <table class="table table-bordered">
            <tr><th>Kategori Barang</th><td>{{ $barang->kategori->kategori_nama }}</td></tr>
            <tr><th>Kode Barang</th><td>{{ $barang->barang_kode }}</td></tr>
            <tr><th>Nama Barang</th><td>{{ $barang->barang_nama }}</td></tr>
            <tr><th>Harga Beli</th><td>{{ number_format($barang->harga_beli, 0, ',', '.') }}</td></tr>
            <tr><th>Harga Jual</th><td>{{ number_format($barang->harga_jual, 0, ',', '.') }}</td></tr>
            <tr><th>Deskripsi</th><td>{{ $barang->deskripsi }}</td></tr>
        </table>
    </div>