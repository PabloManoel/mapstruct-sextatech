package mapper;

import org.example.dto.DocumentoDTO;
import org.example.dto.FuncionarioDTO;
import org.example.entity.FuncionarioEntity;
import org.example.mapper.DocumentoMapper;
import org.example.mapper.FuncionarioMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentoMapperTest {

    @Test
    @DisplayName("Deve converter dto DocumentoDTO para entity DocumentoEntity")
    public void shouldMapDocumentoDTOtoDocumentoEntity(){

        DocumentoDTO documentoDTO = new DocumentoDTO();
        documentoDTO.setRg("11.111.111-1");
        documentoDTO.setCpf("222.222.222-22");

        var documentoEntity = DocumentoMapper.INSTANCE.toEntity(documentoDTO);

        assertEquals("11.111.111-1", documentoEntity.getRg());
        assertEquals("222.222.222-22", documentoEntity.getCpf());
    }

}
