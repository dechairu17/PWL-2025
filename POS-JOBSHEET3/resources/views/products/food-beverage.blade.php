@extends('layouts.app')

@section('content')
<h1 class="text-center text-primary">Food Beverage</h1>
<div class="row">
    <div class="col-md-4">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Beverages</h5>
                <p class="card-text">Quench your thirst with our wide selection of refreshing beverages.</p>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Snacks</h5>
                <p class="card-text">Enjoy a variety of delicious snacks perfect for any time of day.</p>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Meals & Dishes</h5>
                <p class="card-text">Savor our curated collection of meals and dishes crafted to delight your palate.</p>
            </div>
        </div>
    </div>
</div>
@endsection
