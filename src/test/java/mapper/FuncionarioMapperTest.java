package mapper;

import org.example.dto.DocumentoDTO;
import org.example.dto.FuncionarioDTO;
import org.example.entity.FuncionarioEntity;
import org.example.mapper.FuncionarioMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioMapperTest {

    @Test
    @DisplayName("Deve converter dto FuncionarioDTO para entity FuncionarioEntity")
    public void shouldMapFuncionarioDTOtoFuncionarioEntity(){
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        funcionarioDTO.setNome("Pedro");
        funcionarioDTO.setCargo("Backend developer");
        funcionarioDTO.setSalario(5.000);

        var funcionarioEntity = FuncionarioMapper.INSTANCE.toEntity(funcionarioDTO);

        assertEquals("Pedro", funcionarioEntity.getNome());
        assertEquals("Backend developer", funcionarioEntity.getFuncao());
        assertEquals(5.000, funcionarioEntity.getSalario());
    }

    @Test
    @DisplayName("Deve converter entity FuncionarioEntity para dto FuncionarioDTO")
    public void shouldMapFuncionarioEntitytoFuncionarioDTO(){
        FuncionarioEntity funcionarioEntity = new FuncionarioEntity();
        funcionarioEntity.setNome("Pedro");
        funcionarioEntity.setFuncao("Backend developer");
        funcionarioEntity.setSalario(5.000);

        var funcionarioDTO = FuncionarioMapper.INSTANCE.toDTO(funcionarioEntity);

        assertEquals("Pedro", funcionarioDTO.getNome());
        assertEquals("Backend developer", funcionarioDTO.getCargo());
        assertEquals(5.000, funcionarioDTO.getSalario());
    }

    @Test
    @DisplayName("Deve converter dto DocumentoDTO para entity DocumentoEntity")
    public void shouldMapDocumentoDTOtoDocumentoEntity(){

        DocumentoDTO documento = new DocumentoDTO();
        documento.setRg("111111111");
        documento.setCpf("22222222222");

        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        funcionarioDTO.setNome("Pedro");
        funcionarioDTO.setDocumento(documento);

        var funcionarioEntity = FuncionarioMapper.INSTANCE.toEntity(funcionarioDTO);

        assertEquals("Pedro", funcionarioEntity.getNome());
        assertEquals("111111111", funcionarioEntity.getDocumento().getRg());
        assertEquals("22222222222", funcionarioEntity.getDocumento().getCpf());
    }
}
