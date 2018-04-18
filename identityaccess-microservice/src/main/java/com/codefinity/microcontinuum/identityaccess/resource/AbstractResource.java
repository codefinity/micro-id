package com.codefinity.microcontinuum.identityaccess.resource;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.springframework.http.CacheControl;

import com.codefinity.microcontinuum.identityaccess.application.AccessApplicationService;
import com.codefinity.microcontinuum.identityaccess.application.ApplicationServiceRegistry;
import com.codefinity.microcontinuum.identityaccess.application.IdentityApplicationService;
import com.codefinity.microcontinuum.identityaccess.application.NotificationApplicationService;
import com.codefinity.microcontinuum.identityaccess.domain.model.identity.User;

public class AbstractResource {

    public AbstractResource() {
        super();
    }

    protected AccessApplicationService accessApplicationService() {
        return ApplicationServiceRegistry.accessApplicationService();
    }

    protected CacheControl cacheControlFor(int aNumberOfSeconds) {
        /*CacheControl cacheControl = new CacheControl();
        cacheControl.setMaxAge(aNumberOfSeconds);
        return cacheControl;*/
    	
    	return null;
    }

    protected IdentityApplicationService identityApplicationService() {
        return ApplicationServiceRegistry.identityApplicationService();
    }

    protected NotificationApplicationService notificationApplicationService() {
        return ApplicationServiceRegistry.notificationApplicationService();
    }

    /*protected EntityTag userETag(User aUser) {

        EntityTag tag = null;

        int hashCode = aUser.hashCode() + aUser.person().hashCode();

        try {
            // change this algorithm as needed
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(Integer.toString(hashCode).getBytes("UTF-8"));
            BigInteger digestValue = new BigInteger(1, messageDigest.digest());
            String strongHash = digestValue.toString(16);

            tag = new EntityTag(strongHash);

        } catch (Throwable t) {
            tag = new EntityTag(Integer.toString(hashCode));
        }

        return tag;
    }*/
}