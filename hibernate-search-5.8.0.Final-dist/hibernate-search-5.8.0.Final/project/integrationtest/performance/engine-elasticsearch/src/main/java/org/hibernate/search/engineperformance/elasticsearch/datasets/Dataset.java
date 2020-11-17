/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.engineperformance.elasticsearch.datasets;

import org.hibernate.search.spi.IndexedTypeIdentifier;

public interface Dataset<T> {

	T create(int id);

	IndexedTypeIdentifier getTypeId();

}
