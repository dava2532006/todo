package com.app.todolist_be.dtos;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDetailDto {

    @NotNull(message = "Nomor Whatsapp tidak boleh kosong")
    @NotBlank(message = "Nomor Whatsapp tidak boleh kosong")
    @Pattern(regexp = "^\\+62\\d+$",message = "Format nomor whatsapp tidak sesuai")
    @Size(max=15, message = "Panjang nomor Whatsapp maksimal 15 karakter")
    private String waNumber;

}
