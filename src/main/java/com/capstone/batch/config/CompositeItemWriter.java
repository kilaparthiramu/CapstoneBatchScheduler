/*package com.capstone.batch.config;

import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

public class CompositeItemWriter<T> implements ItemStreamWriter<T>, InitializingBean {

	private List<ItemWriter<? super T>> delegates;

	private boolean ignoreItemStream = false;

	public void setIgnoreItemStream(boolean ignoreItemStream) {
		this.ignoreItemStream = ignoreItemStream;
	}

    @Override
	public void write(List<? extends T> item) throws Exception {
		for (ItemWriter<? super T> writer : delegates) {
			writer.write(item);
		}
		System.out.println("===============");
	}

    @Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(delegates, "The 'delegates' may not be null");
		Assert.notEmpty(delegates, "The 'delegates' may not be empty");
	}

	*//**
	 * The list of item writers to use as delegates. Items are written to each of the
	 * delegates.
	 *
	 * @param delegates the list of delegates to use.  The delegates list must not be null nor be empty.
	 *//*
	public void setDelegates(List<ItemWriter<? super T>> delegates) {
		this.delegates = delegates;
	}

    @Override
	public void close() throws ItemStreamException {
		for (ItemWriter<? super T> writer : delegates) {
			if (!ignoreItemStream && (writer instanceof ItemStream)) {
				((ItemStream) writer).close();
			}
		}
	}

    @Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		for (ItemWriter<? super T> writer : delegates) {
			if (!ignoreItemStream && (writer instanceof ItemStream)) {
				((ItemStream) writer).open(executionContext);
			}
		}
	}

    @Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		for (ItemWriter<? super T> writer : delegates) {
			if (!ignoreItemStream && (writer instanceof ItemStream)) {
				((ItemStream) writer).update(executionContext);
			}
		}
	}

}
*/