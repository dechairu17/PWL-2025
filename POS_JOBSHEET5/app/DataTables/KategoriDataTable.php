<?php

namespace App\DataTables;

use App\Models\KategoriModel;
use Yajra\DataTables\Html\Button;
use Yajra\DataTables\Html\Column;
use Yajra\DataTables\EloquentDataTable;
use Yajra\DataTables\Services\DataTable;
use Yajra\DataTables\Html\Builder as HtmlBuilder;
use Illuminate\Database\Eloquent\Builder as QueryBuilder;

class KategoriDataTable extends DataTable
{
    public function dataTable(QueryBuilder $query): EloquentDataTable
    {
        return (new EloquentDataTable($query))
            ->addColumn('action', function ($kategori) {
                return '
                <div class="d-flex">
                    <a href="' . route('kategori.edit', $kategori->kategori_id) . '" 
                        class="btn btn-sm btn-warning text-dark fw-bold px-3 mx-1">Edit</a>

                    <form action="' . route('kategori.destroy', $kategori->kategori_id) . '" 
                        method="POST" class="d-inline delete-form">
                        ' . csrf_field() . '
                        ' . method_field('DELETE') . '
                        <button type="submit" 
                            class="btn btn-sm btn-danger text-white fw-bold px-3 mx-1 delete-btn"
                            onclick="return confirm(\'Yakin ingin menghapus?\')">
                            Delete
                        </button>
                    </form>
                </div>';
            })
            ->rawColumns(['action'])
            ->setRowId('kategori_id');
    }

    public function query(KategoriModel $model): QueryBuilder
    {
        return $model->newQuery()->select(['kategori_id', 'kode_kategori', 'nama_kategori', 'created_at', 'updated_at']);
    }

    public function html(): HtmlBuilder
    {
        return $this->builder()
            ->setTableId('kategori-table')
            ->columns($this->getColumns())
            ->minifiedAjax()
            ->orderBy(1)
            ->buttons([
                Button::make('excel'),
                Button::make('csv'),
                Button::make('pdf'),
                Button::make('print'),
                Button::make('reset'),
                Button::make('reload')
            ]);
    }

    public function getColumns(): array
    {
        return [
            Column::computed('action')
                ->exportable(false)
                ->printable(false)
                ->width(60)
                ->addClass('text-center'),
            Column::make('kategori_id')->title('Kategori ID'),
            Column::make('kode_kategori')->title('Kategori Kode'),
            Column::make('nama_kategori')->title('Kategori Nama'),
            Column::make('created_at')->title('Created At'),
            Column::make('updated_at')->title('Updated At'),
        ];
    }

    protected function filename(): string
    {
        return 'Kategori_' . date('YmdHis');
    }
}
