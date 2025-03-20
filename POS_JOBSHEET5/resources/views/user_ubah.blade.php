<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Ubah Data User</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-5">

    <h1>Form Ubah Data User</h1>
    <a href="/user" class="btn btn-secondary mb-3">Kembali</a>

    <form method="post" action="/user/ubah_simpan/{{ $data->user_id }}" class="card p-4 shadow">
        {{ csrf_field() }}
        {{ method_field('PUT') }}

        <div class="mb-3">
            <label class="form-label">Username</label>
            <input type="text" name="username" class="form-control" placeholder="Masukan Username" value="{{ $data->username }}">
        </div>

        <div class="mb-3">
            <label class="form-label">Nama</label>
            <input type="text" name="nama" class="form-control" placeholder="Masukan Nama" value="{{ $data->nama }}">
        </div>

        <div class="mb-3">
            <label class="form-label">Password</label>
            <input type="password" name="password" class="form-control" placeholder="Masukan Password" value="{{ $data->password }}">
        </div>

        <div class="mb-3">
            <label class="form-label">Level ID</label>
            <input type="number" name="level_id" class="form-control" placeholder="Masukan ID Level" value="{{ $data->level_id }}">
        </div>

        <button type="submit" class="btn btn-success">Ubah</button>
    </form>

</body>
</html>
