package pl.sda.tdd3;

import org.graalvm.compiler.debug.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AlbumReadWriteTest {

    AlbumReadWrite albumReadWrite = new AlbumReadWrite();

    @Test
    public void testReadAlbumFromFile() throws IOException {
        //given
        String path = "C:\\SDA\\album.csv";
        AlbumModel expectedModel = new AlbumModel("Punk",
                "Kult","Prosto",1,3);
        Map<Integer, AlbumModel> expectedAlbum = new HashMap<Integer, AlbumModel>();
        expectedAlbum.put(expectedModel.getAlbumId(), expectedModel);
        Map<Integer, AlbumModel> actualAlbum = new HashMap<Integer, AlbumModel>();

        //when
        actualAlbum = albumReadWrite.readAlbumFromFile(path);

        //then
        

    }

    @Test
    public void testWriteAlbumToFile() {
        //given

        //when

        //then

    }





}
