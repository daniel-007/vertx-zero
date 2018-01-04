/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.pojos;


import javax.annotation.Generated;

import up.god.jooq.tables.interfaces.ISecRelUserRole;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SecRelUserRole implements ISecRelUserRole {

    private static final long serialVersionUID = -1014277577;

    private String rRoleId;
    private String rUserId;

    public SecRelUserRole() {}

    public SecRelUserRole(SecRelUserRole value) {
        this.rRoleId = value.rRoleId;
        this.rUserId = value.rUserId;
    }

    public SecRelUserRole(
        String rRoleId,
        String rUserId
    ) {
        this.rRoleId = rRoleId;
        this.rUserId = rUserId;
    }

    @Override
    public String getRRoleId() {
        return this.rRoleId;
    }

    @Override
    public SecRelUserRole setRRoleId(String rRoleId) {
        this.rRoleId = rRoleId;
        return this;
    }

    @Override
    public String getRUserId() {
        return this.rUserId;
    }

    @Override
    public SecRelUserRole setRUserId(String rUserId) {
        this.rUserId = rUserId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SecRelUserRole (");

        sb.append(rRoleId);
        sb.append(", ").append(rUserId);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISecRelUserRole from) {
        setRRoleId(from.getRRoleId());
        setRUserId(from.getRUserId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISecRelUserRole> E into(E into) {
        into.from(this);
        return into;
    }

    public SecRelUserRole(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
