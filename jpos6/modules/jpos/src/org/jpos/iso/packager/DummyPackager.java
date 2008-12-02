/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2008 Alejandro P. Revilla
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.iso.packager;

import java.io.IOException;
import java.io.InputStream;

import org.jpos.util.Log;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOComponent;

public class DummyPackager extends Log implements ISOPackager {
    public byte[] pack (ISOComponent m) throws ISOException {
        throw new ISOException ("N/A");
    }
    public int unpack (ISOComponent m, byte[] b) throws ISOException {
        throw new ISOException ("N/A");
    }
    public void unpack (ISOComponent m, InputStream in) throws ISOException {
        throw new ISOException ("N/A");
    }
    public String getFieldDescription(ISOComponent m, int fldNumber) {
        return null;
    }
    public ISOMsg createISOMsg() {
        return new ISOMsg();
    }
}
