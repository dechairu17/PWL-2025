@extends('layouts.template')

@section('content')
    <div class="card card-outline card-primary">
        <div class="card-header">
            <h3 class="card-title">Daftar Barang</h3>
            <div class="card-tools">
                <button onclick="modalAction('{{ url('/barang/import') }}')" class="btn btn-info">Import Barang</button>
                <a href="{{ url('/barang/create') }}" class="btn btn-primary">Tambah Data (Ajax)</a>
            </div>
        </div>

        <!-- Untuk Filter Data -->
        <div id="filter" class="form-horizontal filter-date p-2 border-bottom mb-2">
            <div class="row">
                <div class="col-md-12">
                    <div class="form-group form-group-sm row text-sm mb-0">
                        <label for="filter_kategori" class="col-md-1 col-form-label">Filter</label>
                        <div class="col-md-3">
                            <select name="filter_kategori" class="form-control filter_kategori">
                                <option value="">- Semua -</option>
                                @foreach ($kategori as $l)
                                    <option value="{{ $l->Kategori_id }}">{{ $l->kategori_nama }}</option>
                                @endforeach
                            </select>
                            <small class="form-text text-muted">Kategori Barang</small>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        @if (session('success'))
            <div class="alert alert-success">{{ session('success') }}</div>
        @endif
        @if (session('error'))
            <div class="alert alert-danger">{{ session('error') }}</div>
        @endif

        <table class="table table-bordered table-sm table-striped table-hover" id="table-barang">
            <thead>
                <tr>
                    <th>No</th>
                    <th>Kode Barang</th>
                    <th>Nama Barang</th>
                    <th>Harga Beli</th>
                    <th>Harga Jual</th>
                    <th>Kategori</th>
                    <th>Aksi</th>
                </tr>
            </thead>
            <tbody></tbody>
        </table>
    </div>

    <div id="myModal" class="modal fade animate shake" tabindex="-1" data-backdrop="static" data-keyboard="false"
        data-width="75%"></div>

    <!-- Modal Detail -->
    <div class="modal fade" id="modalDetail" tabindex="-1" role="dialog">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header bg-info">
                    <h5 class="modal-title">Detail Barang</h5>
                    <button type="button" class="close" data-dismiss="modal"><span>&times;</span></button>
                </div>
                <div class="modal-body" id="detailContent">
                    <div class="text-center">Loading...</div>
                </div>
            </div>
        </div>
    </div>
@endsection

@push('js')
    <script>
        function modalAction(url = '') {
            $('#myModal').load(url, function () {
                $('#myModal').modal('show');
            });
        }

        var dataUser;
        $(document).ready(function () {
            dataUser = $('#table-barang').DataTable({
                processing: true,
                serverSide: true,
                ajax: {
                    url: "{{ url('barang/list') }}",
                    type: "POST",
                    dataType: "json",
                    data: function (d) {
                        d.Kategori_id = $('.filter_kategori').val();
                    }
                },
                columns: [
                    { data: "DT_RowIndex", className: "text-center", width: "5%", orderable: false, searchable: false },
                    { data: "barang_kode", width: "10%" },
                    { data: "barang_nama", width: "25%" },
                    {
                        data: "harga_beli", width: "10%", render: function (data) {
                            return new Intl.NumberFormat('id-ID').format(data);
                        }
                    },
                    {
                        data: "harga_jual", width: "10%", render: function (data) {
                            return new Intl.NumberFormat('id-ID').format(data);
                        }
                    },
                    { data: "kategori.kategori_nama", width: "15%" },
                    {
                        data: "barang_kode",
                        className: "text-center",
                        width: "15%",
                        orderable: false,
                        searchable: false,
                        render: function (kode) {
                            return `
                                <button class="btn btn-sm btn-info btn-detail" data-kode="${kode}">Detail</button>
                                <a href="/barang/edit/${kode}" class="btn btn-sm btn-warning">Edit</a>
                                <button onclick="modalAction('/barang/confirm/${kode}')" class="btn btn-sm btn-danger">Hapus</button>
                            `;
                        }
                    }
                ]
            });

            $('#table-barang_filter input').unbind().bind('keyup', function (e) {
                if (e.keyCode == 13) {
                    dataUser.search(this.value).draw();
                }
            });

            $('.filter_kategori').change(function () {
                dataUser.draw();
            });

            // Tombol Detail
            $(document).on('click', '.btn-detail', function () {
                let kode = $(this).data('kode');
                $('#detailContent').html('<div class="text-center">Memuat...</div>');
                $('#modalDetail').modal('show');

                // AJAX request to fetch data for the selected item
                $.ajax({
                    url: `/barang/detail/${kode}`,  // Ensure that the route is correct
                    type: 'GET',
                    success: function (res) {
                        if (res.status) {
                            $('#detailContent').html(res.data);  // Load the data into modal
                        } else {
                            $('#detailContent').html('<div class="alert alert-danger">Gagal mengambil data.</div>');
                        }
                    },
                    error: function () {
                        $('#detailContent').html('<div class="alert alert-danger">Gagal mengambil data.</div>');
                    }
                });
            });
        });
    </script>
@endpush
