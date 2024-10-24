package Main;

import java.util.Objects;

public class BuildingBlocks {
    private String name;
    private String mobilityBlocks; //Тобто, чи можна рухати блок за допомогою поршнів
    private String locationBlocks; //У якому світі знаходиться
    public int hardness; //Твердість блоку
    public int lightLevel; //Рівень світла, який блок випромінює
    private boolean isTransparent;

    public BuildingBlocks(String name, String mobilityBlocks, String locationBlocks, int hardness, int lightLevel, boolean isTransparent) {
        this.name = name;
        this.mobilityBlocks = mobilityBlocks;
        this.locationBlocks = locationBlocks;
        this.hardness = hardness;
        this.lightLevel = lightLevel;
        this.isTransparent = isTransparent;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "BuildingBlocks: " +
                "name='" + name + '\'' +
                ", mobilityBlocks='" + mobilityBlocks + '\'' +
                ", locationBlocks='" + locationBlocks + '\'' +
                ", hardness=" + hardness +
                ", lightLevel=" + lightLevel +
                ", isTransparent=" + isTransparent;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingBlocks that = (BuildingBlocks) o;
        return hardness == that.hardness && lightLevel == that.lightLevel && isTransparent == that.isTransparent &&
                Objects.equals(name, that.name) && Objects.equals(mobilityBlocks, that.mobilityBlocks) &&
                Objects.equals(locationBlocks, that.locationBlocks);
    }

    public int hashCode() {
        return Objects.hash(name, mobilityBlocks, locationBlocks, hardness, lightLevel, isTransparent);
    }

}
