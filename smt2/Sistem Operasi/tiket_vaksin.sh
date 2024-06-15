#!/bin/bash

USER_FILE="users.txt" # File untuk menyimpan akun pengguna
HISTORY_FILE="history.txt" # File untuk menyimpan riwayat pembelian
STRUCK_DIR="struck" # Direktori untuk menyimpan struk pembelian

buat_akun() {
  echo "=== Buat Akun Baru ==="
  read -p "Masukkan username: " username
  read -sp "Masukkan password: " password
  tanggal_pembuatan_akun=$(date +%Y-%m-%d)

  echo
  if grep -q "^$username:" $USER_FILE; then
    echo "Username sudah ada, masukan username lain!"
  else
    echo "$username:$password:$tanggal_pembuatan_akun" >> $USER_FILE
    echo "$username - $tanggal_pembuatan_akun" >> $HISTORY_FILE
    echo "Akun berhasil dibuat!"
  fi
}

login() {
    echo "=== Login ==="
    read -p "Masukkan username: " username # Meminta input username
    read -sp "Masukkan password: " password # Meminta input password secara rahasia
    echo

    if grep -q "^$username:$password" $USER_FILE; then
        echo "Login berhasil!"
        current_user=$username # Set pengguna saat ini
    else
        echo "Username atau password salah!" # Pesan jika username atau password salah
        current_user=""
    fi
}

list_vaksin() {
    echo "=== Daftar Vaksin ==="
    echo "1. Rabies: Rp 50000"
    echo "2. FCV: Rp 75000"
    echo "3. FHV-1: Rp 100000"
    echo "4. FPV: Rp 150000"
}

beli_vaksin() {
    if [ -z "$current_user" ]; then
        echo "Anda harus login terlebih dahulu untuk membeli tiket!" # Pesan jika belum login
        return
    fi

    list_vaksin # Menampilkan daftar vaksin
    read -p "Pilih vaksin (masukkan nomor): " pilih_vaksin # Meminta input pilihan vaksin

    case $pilih_vaksin in
        1) vaksin="Rabies"; price_per_unit=50000 ;;
        2) vaksin="FCV"; price_per_unit=75000 ;;
        3) vaksin="FHV-1"; price_per_unit=100000 ;;
        4) vaksin="FPV"; price_per_unit=150000 ;;
        *) echo "Vaksin tidak valid!"; return ;;
    esac

    read -p "Masukkan jumlah: " jumlah 
    if [[ $jumlah =~ ^[0-9]+$ ]]; then
        price=$((price_per_unit * jumlah)) # Menghitung total harga
        echo "Anda telah membeli $jumlah tiket vaksin $vaksin seharga Rp $price"
        echo "$current_user membeli $jumlah tiket vaksin $vaksin seharga Rp $price" >> $HISTORY_FILE # Menyimpan riwayat pembelian

        # Buat invoice
        mkdir -p $STRUCK_DIR 
        invoice_file="${STRUCK_DIR}/${current_user}_invoice.txt"
        echo "Username: $current_user" > $invoice_file
        echo "Vaksin: $vaksin" >> $invoice_file
        echo "Jumlah: $jumlah" >> $invoice_file
        echo "Total Harga: Rp $price" >> $invoice_file
        echo "Struk pembelian telah dicetak ke $invoice_file"
    else
        echo "Jumlah tidak valid!" # Pesan jika jumlah tidak valid
    fi
}

cek_history_pembuatan_akun() {
  USER_FILE="users.txt"  # Ganti dengan path file Anda
  echo "=== Riwayat Pembuatan Akun ==="

  # Read the user file line by line
  while IFS=' - ' read -r tanggal username; do
    IFS='-' read -r dd mm yyyy <<< "$tanggal"
    echo "Tanggal Pembuatan: $yyyy-$mm-$dd - Username: $username"
  done < "$USER_FILE"
}




cek_history() {
    if [ -z "$current_user" ]; then
        echo "Anda harus login terlebih dahulu untuk melihat riwayat pembelian!" # Pesan jika belum login
        return
    fi

    echo "=== Riwayat Pembelian ==="
    grep "$current_user" $HISTORY_FILE || echo "Tidak ada riwayat pembelian" # Menampilkan riwayat pembelian
echo "" > $HISTORY_FILE
}

cek_semua_history() {
    echo "=== Seluruh Riwayat Penjualan ==="
    if [ -s $HISTORY_FILE ]; then
        cat $HISTORY_FILE
    else
        echo "Tidak ada riwayat penjualan"
    fi
}

while true; do
    echo "=== Aplikasi Tiket Vaksin Kucing ==="
    echo "1. Buat Akun"
    echo "2. Login"
    echo "3. List Vaksin"
    echo "4. Beli Vaksin"
    echo "5. Riwayat Pembelian"
    echo "6. Seluruh Riwayat Penjualan"
    echo "7. cek_akun"
    echo "8. Keluar"
    read -p "Pilih opsi: " pilihan

    case $pilihan in
        1) buat_akun ;; # Panggil fungsi create_account
        2) login ;; # Panggil fungsi login
        3) list_vaksin ;; # Panggil fungsi list_vaksin
        4) beli_vaksin ;; # Panggil fungsi buy_vaksin
        5) cek_history ;; # Panggil fungsi view_history
        6) cek_semua_history ;; # Panggil fungsi view_all_history
	7) cek_history_pembuatan_akun ;;
        8) echo "Terima kasih telah menggunakan aplikasi ini!" ; exit ;; # Keluar dari aplikasi
        *) echo "Opsi tidak valid!" ;; # Pesan jika opsi tidak valid
    esac
    echo
done
