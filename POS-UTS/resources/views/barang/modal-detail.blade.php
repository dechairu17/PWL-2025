<div class="modal fade" id="modal-master" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header bg-info">
          <h5 class="modal-title">Detail Data Barang</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          <table class="table table-bordered">
            <tr>
              <th>Kategori Barang:</th>
              <td>{{ $detail->kategori->kategori_nama ?? '-' }}</td>
            </tr>
            <tr>
              <th>Kode Barang:</th>
              <td>{{ $detail->barang_kode }}</td>
            </tr>
            <tr>
              <th>Nama Barang:</th>
              <td>{{ $detail->barang_nama }}</td>
            </tr>
            <tr>
              <th>Harga Beli:</th>
              <td>{{ number_format($detail->harga_beli, 0, ',', '.') }}</td>
            </tr>
            <tr>
              <th>Harga Jual:</th>
              <td>{{ number_format($detail->harga_jual, 0, ',', '.') }}</td>
            </tr>
            <tr>
              <th>Dimensi:</th>
              <td>{{ $detail->dimensi }}</td>
            </tr>
            <tr>
              <th>Deskripsi:</th>
              <td>{{ $detail->deskripsi }}</td>
            </tr>
          </table>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">Tutup</button>
        </div>
      </div>
    </div>
  </div>
  