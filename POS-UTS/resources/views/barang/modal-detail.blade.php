<div class="modal fade" id="modalDetail" tabindex="-1" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header bg-info">
                <h5 class="modal-title">Detail Barang</h5>
                <button type="button" class="close" data-dismiss="modal"><span>&times;</span></button>
            </div>
            <div class="modal-body" id="detailContent">
                <tr><th>Kategori Barang</th><td>{{ $barang->kategori->kategori_nama }}</td></tr>
                <tr><th>Kode Barang</th><td>{{ $barang->barang_kode }}</td></tr>
                <tr><th>Nama Barang</th><td>{{ $barang->barang_nama }}</td></tr>
                <tr><th>Harga Beli</th><td>{{ number_format($barang->harga_beli) }}</td></tr>
                <tr><th>Harga Jual</th><td>{{ number_format($barang->harga_jual) }}</td></tr>
            </div>
        </div>
    </div>
</div>
