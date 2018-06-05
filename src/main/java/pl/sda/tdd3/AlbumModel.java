package pl.sda.tdd3;


import com.google.common.base.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AlbumModel {
    private String genre;
    private String artist;
    private String albumName;
    private Integer albumId;
    private Integer albumCount;

    public AlbumModel(String genre, String artist,
                      String albumName, Integer albumId,
                      Integer albumCount) {
        this.genre = genre;
        this.artist = artist;
        this.albumName = albumName;
        this.albumId = albumId;
        this.albumCount = albumCount;
    }

    @XmlAttribute(name="gatunek")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @XmlAttribute
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @XmlAttribute
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @XmlAttribute
    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    @XmlAttribute
    public Integer getAlbumCount() {
        return albumCount;
    }

    public void setAlbumCount(Integer albumCount) {
        this.albumCount = albumCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumModel that = (AlbumModel) o;
        return Objects.equal(genre, that.genre) &&
                Objects.equal(artist, that.artist) &&
                Objects.equal(albumName, that.albumName) &&
                Objects.equal(albumId, that.albumId) &&
                Objects.equal(albumCount, that.albumCount);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(genre, artist, albumName, albumId, albumCount);
    }


}
