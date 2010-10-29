/**
 * BaseEntity.java - Class for accessing things that all entities share - X, Y, Z, health.
 * @author James
 */
public class BaseEntity {
    is entity;

    /**
     * Returns the ID for this mob
     * @return id
     */
    public int getId() {
        return entity.c;
    }

    /**
     * Teleports to the provided location
     * @param x
     * @param rotation
     * @param y
     * @param z
     * @param pitch
     */
    public void teleportTo(double x, double y, double z, float rotation, float pitch) {
        entity.b(x, y, z, rotation, pitch);
    }

    /**
     * Teleports to the other entity
     * @param ent entity to teleport to
     */
    public void teleportTo(BaseEntity ent) {
        teleportTo(ent.getX(), ent.getY(), ent.getZ(), ent.getRotation(), ent.getPitch());
    }

    /**
     * Teleports to the provided location
     * @param location location to teleport to
     */
    public void teleportTo(Location location) {
        teleportTo(location.x, location.y, location.z, location.rotX, location.rotY);
    }

    /**
     * Returns the entity's X
     * @return
     */
    public double getX() {
        return entity.l;
    }

    /**
     * Sets the entity's X
     * @param x
     */
    public void setX(double x) {
        teleportTo(x, getY(), getZ(), getRotation(), getPitch());
    }

    /**
     * Returns the entity's Y
     * @return
     */
    public double getY() {
        return entity.m;
    }

    /**
     * Sets the entity's Y
     * @param y
     */
    public void setY(double y) {
        teleportTo(getX(), y, getZ(), getRotation(), getPitch());
    }

    /**
     * Returns the entity's Z
     * @return
     */
    public double getZ() {
        return entity.n;
    }

    /**
     * Sets the entity's Z
     * @param z
     */
    public void setZ(double z) {
        teleportTo(getX(), getY(), z, getRotation(), getPitch());
    }

    /**
     * Returns the entity's pitch
     * @return
     */
    public float getPitch() {
        return entity.s;
    }

    /**
     * Sets the entity's pitch
     * @param pitch
     */
    public void setPitch(float pitch) {
        teleportTo(getX(), getY(), getZ(), getRotation(), pitch);
    }

    /**
     * Returns the entity's rotation
     * @return
     */
    public float getRotation() {
        return entity.r;
    }

    /**
     * Sets the entity's rotation
     * @param rotation
     */
    public void setRotation(float rotation) {
        teleportTo(getX(), getY(), getZ(), rotation, getPitch());
    }

    /**
     * Returns this entity's health
     * @return
     */
    public int getHealth() {
        return entity.aM;
    }

    /**
     * Sets this entity's health
     * @param health
     */
    public void setHealth(int health) {
        entity.aM = health;
    }
}
