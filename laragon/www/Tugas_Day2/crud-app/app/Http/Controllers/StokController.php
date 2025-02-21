<?php

namespace App\Http\Controllers;

use App\Models\Item;
use Illuminate\Http\Request;

class ItemController extends Controller
{
    public function index()
    {
        $stok = Item::all();
        return view('stok.index', compact('stok'));
    }

    public function create()
    {
        return view('stok.create');
    }

    public function store(Request $request)
    {
        $request->validate([
            'name' => 'required',
            'description' => 'required',
        ]);

        Item::create($request->only(['name', 'description']));
        return redirect()->route('stok.index')->with('success', 'Item added successfully.');
    }

    public function show(Item $item)
    {
        return view('stok.show', compact('item'));
    }

    public function edit(Item $item)
    {
        return view('stok.edit', compact('item'));
    }

    public function update(Request $request, Item $item)
    {
        $request->validate([
            'name' => 'required',
            'description' => 'required',
        ]);

        $item->update($request->only(['name', 'description']));
        return redirect()->route('stok.index')->with('success', 'Item updated successfully.');
    }

    public function destroy(Item $item)
    {
        $item->delete();
        return redirect()->route('stok.index')->with('success', 'Item deleted successfully.');
    }
}

