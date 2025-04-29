@empty($barang)
    <div id="modal-master" class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Kesalahan</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="alert alert-danger">
                    <h5><i class="icon fas fa-ban"></i> Kesalahan!!!</h5>
                    Data yang anda cari tidak ditemukan
                </div>
                <a href="{{ url('/barang') }}" class="btn btn-warning">Kembali</a>
            </div>
        </div>
    </div>
@else
    <div id="modal-master" class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Detail Barang</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="form-group">
                    <label>Kode Barang</label>
                    <input value="{{ $barang->barang_kode }}" type="text" class="form-control" disabled>
                </div>
                <div class="form-group">
                    <label>Nama Barang</label>
                    <input value="{{ $barang->barang_nama }}" type="text" class="form-control" disabled>
                </div>
                <div class="form-group">
                    <label>Kategori</label>
                    <input value="{{ $barang->kategori->kategori_nama ?? '-' }}" type="text" class="form-control" disabled>
                </div>
                <div class="form-group">
                    <label>Harga Beli</label>
                    <input value="{{ number_format($barang->harga_beli, 0, ',', '.') }}" type="text" class="form-control" disabled>
                </div>
                <div class="form-group">
                    <label>Harga Jual</label>
                    <input value="{{ number_format($barang->harga_jual, 0, ',', '.') }}" type="text" class="form-control" disabled>
                </div>
                <div class="form-group">
                    <label>Dimensi Barang</label>
                    <input value="{{ $barang->dimensi }}" type="text" class="form-control" disabled>
                </div>
                <div class="form-group">
                    <label>Deskripsi Barang</label>
                    <textarea class="form-control" rows="3" disabled>{{ $barang->deskripsi }}</textarea>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" data-dismiss="modal" class="btn btn-warning">Tutup</button>
            </div>
        </div>
    </div>
@endempty
